package com.gy.oil;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * 启动类
 * @ClassName:  WasteOilAcquisitionApplication
 * @author: Mr.叶云
 * @date:   2019年5月11日 下午1:15:06
 */
@SpringBootApplication
@MapperScan("com.gy.oil.mapper")//mapper统一管理在com.gy.oil.mapper中
public class WasteOilAcquisitionApplication {

	public static void main(String[] args) {
		SpringApplication.run(WasteOilAcquisitionApplication.class, args);
	}

}
