package com.spring.fileupload.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.spring.fileupload.dao.UserFileUploadDao;
import com.spring.fileupload.entity.UserFileUpload;

@Controller
public class UserFileUploadController {

	@Autowired
	private UserFileUploadDao fud;
	
	public String savepath="C:/Users/Rakesh/project/SpringMvcFileUploadJavaBasedConfig/src/main/webapp/resource";
	
	@GetMapping("/")
	public String getIndex(Model model) {
		
		model.addAttribute("msg","welcome to File Upload Java Based Demo");
		model.addAttribute("fileupload",new UserFileUpload());
		
		return "index";
	}
	
	@PostMapping("/save")
	public String getFileUpolad(@RequestParam("file")MultipartFile file,Model model) throws Exception {
		
		UserFileUpload f=new UserFileUpload();
		
		File dir=new File(savepath);
		
		f.setFilename(file.getOriginalFilename());
		f.setSavepath(savepath);
		
		byte[] bytes=file.getBytes();
		
		if(!dir.exists()){
			dir.mkdir();
		}
		File uoload=new File(dir.getAbsolutePath()+File.separator+file.getOriginalFilename());
		BufferedOutputStream output=new BufferedOutputStream(new FileOutputStream(uoload));
		
		output.write(bytes);
		output.close();
		
		fud.save(f);
		
		model.addAttribute("Location",uoload);
		
		List<UserFileUpload> flist=fud.list();
		
		model.addAttribute("fileup",flist);
		return "success";
	}
	
	@GetMapping("/fileup")
	public String getResult(Model model) {
		
        List<UserFileUpload> flist=fud.list();
		
		model.addAttribute("fileup",flist);
		
		return "success";
	}

}
