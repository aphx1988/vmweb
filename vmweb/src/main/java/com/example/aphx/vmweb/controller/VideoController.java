package com.example.aphx.vmweb.controller;

import java.util.List;

import javax.annotation.Resource;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.aphx.vmweb.entity.Video;
import com.example.aphx.vmweb.mapper.VideoMapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.aphx.vmweb.entity.Res;

@RestController
@RequestMapping("/video")
public class VideoController {

    @Resource
    VideoMapper mapper;

    @GetMapping("/list")
    public Res<List<Video>> list(@RequestParam(value = "page",defaultValue = "1") int page,
    @RequestParam(value = "num",defaultValue = "10") int num,
    @RequestParam(value = "filter",defaultValue = "") String filter
    ){
        QueryWrapper<Video> queryWrapper = new QueryWrapper<Video>().select("id","name","path","rate","width","height","duration");
        if(!filter.isEmpty()){
            queryWrapper = queryWrapper.like(true, "name", filter);
        }
        List<Video> list = mapper.selectPage(new Page<Video>(page,num),queryWrapper).getRecords();
        return new Res<List<Video>>(list,"成功",0); 
    } 
}
