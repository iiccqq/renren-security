package io.renren.modules.oss.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import io.renren.modules.oss.entity.Content;
import io.renren.modules.sys.dao.ContentDao;


@Service("contentService")
public class ContentService extends ServiceImpl<ContentDao, Content> {

}
