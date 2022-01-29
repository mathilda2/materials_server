package com.yzh.market.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.yzh.market.common.CommonResp;
import com.yzh.market.common.PageResp;
import com.yzh.market.req.MarketUserReq;
import com.yzh.market.service.UserService;
import com.yzh.market.vo.MarketUserVo;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private CommonResp res ;
	
	public static final String PATH = "D:\\sts4 bundle\\sts 49 dav space\\nginx-1.20.1\\html\\avatar\\";
	
	@RequestMapping("/list")
	public CommonResp list(@RequestBody MarketUserReq user,HttpServletRequest httpServletRequest) {
		CommonResp<PageResp<MarketUserVo>> resp = new CommonResp<PageResp<MarketUserVo>>();
		PageResp<MarketUserVo> list = userService.list(user);
		resp.setContent(list); 
		resp.setMessage("操作成功");
		return resp;
	}
	
	@RequestMapping("/save")
	public CommonResp save(@RequestBody MarketUserReq user,HttpSession session) {
		CommonResp resp  = userService.save(user,session);
		return resp;
	}
	
	@RequestMapping("/delete")
	public CommonResp delete(@RequestBody MarketUserReq user) {
		CommonResp resp  = userService.delete(user);
		return resp;
	}
	
	@RequestMapping("/upload")
	public CommonResp upload(
			@RequestParam(name = "file", required = false) MultipartFile file, 
			HttpServletRequest request) throws FileNotFoundException {
		if (file == null) {
			res.setMessage("请选择要上传的图片");
	        return res;
	    }
		//String path = ResourceUtils.getURL("classpath:").getPath();
		String path = "D:\\sts4 bundle\\sts 49 dav space\\nginx-1.20.1\\html\\avatar\\";
		String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1, file.getOriginalFilename().length());
		File savePathFile = new File(path);
		if (!savePathFile.exists()) {
		    //若不存在该目录，则创建目录
		    savePathFile.mkdir();
		}
		String filename = UUID.randomUUID().toString().replaceAll("-","") + "." + suffix;
		try {
		    //将文件保存指定目录
		    file.transferTo(new File(savePathFile + "\\"+filename));
		} catch (Exception e) {
		    e.printStackTrace();
		    res.setMessage("保存文件异常");
		    return res ;
		}
		res.setMessage("上传成功");
		Map<String,Object> m = new HashMap<String,Object>();
	    res.setContent(filename);
        return res;
	}
	
	@RequestMapping("/deleteImg")
	public CommonResp deleteImg(@RequestBody MarketUserReq user) {
		String image = user.getImage();
		File savePathFile = new File(PATH+"\\"+image);
		boolean exists = savePathFile.exists();
		if(exists && !"".equals(image)) {
			savePathFile.delete();
			res.setMessage("操作完成!");
		}else {
			res.setMessage("图片不存在!");
		}
        return res;
	}
	
}
