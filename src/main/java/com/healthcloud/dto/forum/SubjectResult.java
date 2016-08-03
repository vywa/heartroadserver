package com.healthcloud.dto.forum;

import java.util.List;

import com.healthcloud.domain.forum.ReplySubject;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午9:28:47
* 帖子返回类
*/
public class SubjectResult {

	private int subjectId;						//帖子id
	
	//帖子详情
	private String content;						//帖子内容
	private List<String> imgUrls;			//图片地址
	private String fileUrl;							//附件url
	private String videoUrl;						//视频地址
	private String soundUrl;					//声音地址
	
	//帖子作者信息
	private int authorId;							//作者id
	private String title;								//标题
	private String author;						//作者
	private String authorPhotoImgUrl;				//作者图像
	private String locInfo;							//具体的定位信息
	private double lng;							//定位的经度
	private double lat;							//定位的纬度
	
	//帖子统计信息		
	private int replyNum;						//回复数
	private int viewCount;						//浏览数
	private int likeCount;						//被多少人赞过
	private int collectionCount;			//收藏次数
	
	//我对帖子互动
	private boolean liked;					//是否被我赞过
	private boolean collection;		//是否被我收藏过
	
	//帖子属性
	private long publishTime;				//发帖时间
	private int subjectType;					//帖子类型	(删除-1，精华１，我的问题２，收藏３)
	
	private List<ReplySubject> replyList;				//回复列表

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<String> getImgUrls() {
		return imgUrls;
	}

	public void setImgUrls(List<String> imgUrls) {
		this.imgUrls = imgUrls;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getSoundUrl() {
		return soundUrl;
	}

	public void setSoundUrl(String soundUrl) {
		this.soundUrl = soundUrl;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthorPhotoImgUrl() {
		return authorPhotoImgUrl;
	}

	public void setAuthorPhotoImgUrl(String authorPhotoImgUrl) {
		this.authorPhotoImgUrl = authorPhotoImgUrl;
	}

	public String getLocInfo() {
		return locInfo;
	}

	public void setLocInfo(String locInfo) {
		this.locInfo = locInfo;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public int getReplyNum() {
		return replyNum;
	}

	public void setReplyNum(int replyNum) {
		this.replyNum = replyNum;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public int getCollectionCount() {
		return collectionCount;
	}

	public void setCollectionCount(int collectionCount) {
		this.collectionCount = collectionCount;
	}

	public boolean isLiked() {
		return liked;
	}

	public void setLiked(boolean liked) {
		this.liked = liked;
	}

	public boolean isCollection() {
		return collection;
	}

	public void setCollection(boolean collection) {
		this.collection = collection;
	}

	public long getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(long publishTime) {
		this.publishTime = publishTime;
	}

	public int getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(int subjectType) {
		this.subjectType = subjectType;
	}

	public List<ReplySubject> getReplyList() {
		return replyList;
	}

	public void setReplyList(List<ReplySubject> replyList) {
		this.replyList = replyList;
	}
	
	

	
	
	
}
