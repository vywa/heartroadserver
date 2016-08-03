package com.healthcloud.service.impl.forum;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.healthcloud.dao.forum.SubjectDao;
import com.healthcloud.domain.account.Information;
import com.healthcloud.domain.forum.ReplySubject;
import com.healthcloud.domain.forum.Subject;
import com.healthcloud.domain.operation.CollectionOperation;
import com.healthcloud.domain.operation.LikeOperation;
import com.healthcloud.dto.forum.SubjectResult;
import com.healthcloud.service.account.InformationService;
import com.healthcloud.service.forum.ReplySubjectService;
import com.healthcloud.service.forum.SubjectService;
import com.healthcloud.service.operation.CollectionOperationService;
import com.healthcloud.service.operation.LikeOperationService;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午10:39:00
* 帖子业务实现类
*/
@Service
public class SubjectServiceImpl implements SubjectService{

	@Resource
	private SubjectDao subjectDao;
	
	@Resource
	private InformationService informationService;
	
	@Resource
	private ReplySubjectService replySubjectService;
	
	@Resource 
	private CollectionOperationService collectionOperatoinService;
	
	@Resource
	private LikeOperationService likeOperationService;
	
	@Override
	public void add(Subject subject) {
		// TODO Auto-generated method stub
		subjectDao.add(subject);
	}

	@Override
	public List<SubjectResult> queryList(int authorId, int start, int limit) {
		// TODO Auto-generated method stub
		List<Subject> result = subjectDao.findSubjectByAuthor(authorId, start, limit);
		List<SubjectResult> sr = new LinkedList<SubjectResult>();
		if(result!=null){
			for(Subject subject : result){
				SubjectResult temp = new SubjectResult();
				Information info = informationService.getInfoById(subject.getAuthorId());
				temp.setAuthor(info.getNickname());
				temp.setAuthorPhotoImgUrl(info.getIconUrl());
				
				//帖子收藏列表
				CollectionOperation co = new CollectionOperation();
				co.setDetailId(subject.getId());
				co.setKind(1); 			//收藏帖子
				co.setUserId(subject.getAuthorId());
				co = collectionOperatoinService.query(co);
				if(co!= null){
					//查询用户收藏
					temp.setCollection(true);
				} else {
					//查询用户收藏
					temp.setCollection(false);
				}
				//帖子收藏列表
				LikeOperation lo = new LikeOperation();
				lo.setDetailId(subject.getId());
				lo.setKind(1); 			//收藏帖子
				lo.setUserId(subject.getAuthorId());
				lo = likeOperationService.query(lo);
				if(lo != null){
					//查询我是否点赞
					temp.setLiked(true);
				} else {
					//查询我是否点赞
					temp.setLiked(false);
				}
				temp.setCollectionCount(subject.getCollectionCount());
				temp.setContent(subject.getContent());
				temp.setFileUrl(subject.getFileUrl());
				String oldimg = subject.getImgUrls();
				String[] newImgs = oldimg.split(";");
				//数组转为list
				List<String> imgsList =  Arrays.asList(newImgs); 
				temp.setImgUrls(imgsList);
				temp.setLat(subject.getLat());
				temp.setLng(subject.getLng());
				temp.setLikeCount(subject.getLikeCount());
			
				temp.setPublishTime(subject.getPublishTime().getTime());
				//查询帖子对应的回复列表
				List<ReplySubject> replyList = replySubjectService.querySubject(subject.getId(), 0, 10);
				temp.setReplyList(replyList);
				temp.setReplyNum(subject.getReplyNum());
				temp.setSoundUrl(subject.getSoundUrl());
				temp.setSubjectId(subject.getId());
				temp.setSubjectType(subject.getSubjectType());
				temp.setTitle(subject.getTitle());
				temp.setVideoUrl(subject.getVideoUrl());
				temp.setViewCount(subject.getViewCount());
				sr.add(temp);
			}
			return sr;
		} else {
			return null;
		}
	}

	@Override
	public List<SubjectResult> queryAll(int start, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubjectResult querySubject(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		subjectDao.delete(id);
	}

	@Override
	public void perfect(int id) {
		// TODO Auto-generated method stub
		subjectDao.perfect(id);
	}

	@Override
	@Transactional
	public int like(int id,int userId) {
		// TODO Auto-generated method stub
		subjectDao.like(userId);
		LikeOperation lo = new LikeOperation();
		lo.setKind(0);
		lo.setDetailId(id);
		lo.setOperationTime(new Date());
		lo.setUserId(userId);
		//添加点赞操作
		likeOperationService.add(lo);
		return 0;
	}

	@Override
	@Transactional
	public int collection(int id,int userId) {
		// TODO Auto-generated method stub
		CollectionOperation co  = new CollectionOperation();
		co.setDetailId(id);
		co.setKind(0);
		co.setOperationTime(new Date());
		co.setUserId(userId);
		//收藏操作
		collectionOperatoinService.add(co);
		return 0;
	}

}
