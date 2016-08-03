package com.healthcloud.domain.forum;

import java.io.Serializable;
import java.util.Date;

/**
* @author bob E-mail:panbaoan@thealth.cn
* @version 创建时间：2016年6月21日 上午9:04:24
* 帖子
*/
public class Subject implements Serializable{

	private int id;															//帖子id		
	
	//帖子详情
	private String title;													//帖子内容
	private String content;											//帖子内容

	private String imgUrls;
	private String fileUrl;												//附件url
	private String videoUrl;											//视频地址
	private String soundUrl;										//声音地址
	
	//帖子作者信息
	private int authorId;												//作者id
	private String locInfo;											//具体的定位信息
	private double lng;												//定位的经度
	private double lat;												//定位的纬度

	//帖子统计信息		
	private int replyNum;											//回复数
	private int viewCount;											//浏览数
	private int likeCount;											//被多少人赞过
	private int collectionCount;								//收藏次数
	
	private String collectIdList;									//收藏人列表
	private String likeIdList;										//点赞人列表
	
	
	//帖子属性
	private Date publishTime;									//发帖时间
	private int subjectType;										//帖子类型	(删除-1，精华１，我的问题２，收藏4)
	
	
	
	public String getCollectIdList() {
		return collectIdList;
	}
	public void setCollectIdList(String collectIdList) {
		this.collectIdList = collectIdList;
	}
	public String getLikeIdList() {
		return likeIdList;
	}
	public void setLikeIdList(String likeIdList) {
		this.likeIdList = likeIdList;
	}
	public void setImgUrls(String imgUrls) {
		this.imgUrls = imgUrls;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getImgUrls() {
		return imgUrls;
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
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public int getSubjectType() {
		return subjectType;
	}
	public void setSubjectType(int subjectType) {
		this.subjectType = subjectType;
	}
	
	
	@Override
	public String toString() {
		return "Subject [id=" + id + ", title=" + title + ", content=" + content + ", imgUrls=" + imgUrls + ", fileUrl="
				+ fileUrl + ", videoUrl=" + videoUrl + ", soundUrl=" + soundUrl + ", authorId=" + authorId
				+ ", IocInfo=" + locInfo + ", lng=" + lng + ", lat=" + lat + ", replyNum=" + replyNum + ", viewCount="
				+ viewCount + ", likeCount=" + likeCount + ", collectionCount=" + collectionCount + ", publishTime="
				+ publishTime + ", subjectType=" + subjectType + "]";
	}
	
	//private List<ReplySubject> replyList;				//回复列表
	
	
	
	
}
