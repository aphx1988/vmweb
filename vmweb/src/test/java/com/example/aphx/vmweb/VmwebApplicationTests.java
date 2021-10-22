package com.example.aphx.vmweb;

import java.util.List;

import javax.annotation.Resource;

import com.example.aphx.vmweb.entity.Video;
import com.example.aphx.vmweb.mapper.VideoMapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VmwebApplicationTests {

	@Resource
	private VideoMapper videoMapper;

	@Test
	void testSelect() {
		System.out.println(("----- selectAll method test ------"));
        List<Video> userList = videoMapper.selectList(null);
        userList.forEach(System.out::println);
	}

}
