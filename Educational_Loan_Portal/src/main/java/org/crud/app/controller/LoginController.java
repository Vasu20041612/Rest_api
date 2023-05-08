package org.crud.app.controller;

import java.util.List;

import org.crud.app.model.AdminModel;
import org.crud.app.model.LoanApplicationModel;
import org.crud.app.model.LoginModel;
import org.crud.app.model.UserModel;
import org.crud.app.service.ServiceLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LoginController {
	@Autowired
    public ServiceLogin lser;
	  
	//AdminModel
	@PostMapping("/post1")
	public AdminModel postD(@RequestBody AdminModel amodel)
	{
		return lser.post1(amodel);
	}
	@GetMapping("/get1")
	public List<AdminModel> getD()
	{
		return lser.get1();
	}
	@PutMapping("/put1")
	public AdminModel putD(@RequestBody AdminModel amodel1)
	{
		return lser.put1(amodel1);
	}
	@DeleteMapping("/del1/{cpas}")
	public String deleteD(@PathVariable("cpas") String password)
	{
		lser.delete1(password);
		return "Deleted";
	}
	
	//LoanApplicationModel
	
	@PostMapping("/post2")
	public LoanApplicationModel postD1(@RequestBody LoanApplicationModel amodel3)
	{
		return lser.post2(amodel3);
	}
	@GetMapping("/get2")
	public List<LoanApplicationModel> getD1()
	{
		return lser.get2();
	}
	@PutMapping("/put2")
	public LoanApplicationModel putD1(@RequestBody LoanApplicationModel amodel4)
	{
		return lser.put2(amodel4);
	}
	@DeleteMapping("/del2/{cid}")
	public String deleteD1(@PathVariable("cid") int loanid)
	{
		lser.delete2(loanid);
		return "Deleted";
	}
	
	//LoginModel
	@PostMapping("/adddetails")
	public LoginModel postD2(@RequestBody LoginModel amodel5)
	{
		return lser.post3(amodel5);
	}
	@GetMapping("/userdetails")
	public List<LoginModel> getD2()
	{
		return lser.get3();
	}
	@PutMapping("/put3")
	public LoginModel putD2(@RequestBody LoginModel amodel6)
	{
		return lser.put3(amodel6);
	}
	@DeleteMapping("/del3/{apass}")
	public String deleteD2(@PathVariable ("apass")String password)
	{
		lser.delete3(password);
		return "Deleted";
	}
	
	//UserModel
	@PostMapping("/post4")
	public UserModel postD3(@RequestBody UserModel amodel7)
	{
		return lser.post4(amodel7);
	}
	@GetMapping("/get4")
	public List<UserModel> getD3()
	{
		return lser.get4();
	}
	@PutMapping("/put4")
	public UserModel putD3(@RequestBody UserModel amodel8)
	{
		return lser.put4(amodel8);
	}
	@DeleteMapping("/del4/{aid}")
	public String deleteD3(@PathVariable("aid") int id)
	{
		lser.delete4(id);
		return "Deleted";
	}
}

