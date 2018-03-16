package io.renren.modules.oss.entity;

import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;


@TableName("vod_content")
public class Content {

	String contentId;
	String title;
	String icon;
	String videoUrl;
	Date createTime;
	Date modifyTime;
	Integer type;
	Integer displayStatus;
	
    Long ossId;
    Long catalogId;
  
    @TableField(exist=false)
	private List<Long> catalogIdList;
    
	public String getContentId() {
		return contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getDisplayStatus() {
		return displayStatus;
	}
	public void setDisplayStatus(Integer displayStatus) {
		this.displayStatus = displayStatus;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	
	public Long getOssId() {
		return ossId;
	}
	public void setOssId(Long ossId) {
		this.ossId = ossId;
	}
	public List<Long> getCatalogIdList() {
		return catalogIdList;
	}
	public void setCatalogIdList(List<Long> catalogIdList) {
		this.catalogIdList = catalogIdList;
	}
	public Long getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(Long catalogId) {
		this.catalogId = catalogId;
	}
	
	
}
