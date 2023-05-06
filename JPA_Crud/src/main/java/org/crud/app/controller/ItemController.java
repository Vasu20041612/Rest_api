package org.crud.app.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.crud.app.model.ItemModel;
import org.crud.app.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

	@Autowired
	ItemService i_ser;
	@PostMapping("/savepost")
	public ItemModel addDetails(@RequestBody ItemModel passengerid)
	{
		return i_ser.saveInfo(passengerid);
	}
	@GetMapping("/sortStudents/{field}")
	public List<ItemModel>sortItemModel(@PathVariable String field)
	{
		return i_ser.sortItemModel(field);
	}
	@PutMapping("/puthm")
	public ItemModel updateDetails(@RequestBody ItemModel passengerid)
	{
		return i_ser.updateInfo(passengerid);
	}
	@DeleteMapping("/delhm/{passengerid}")
	public void deleteDetails(@PathVariable ("iteid") int passengerid)
	{
		i_ser.deleteInfo(passengerid);
	}
	@GetMapping("/gethm/{item_id}")
	public Optional<ItemModel> getDetails(@PathVariable("passengerid") int passengerid)
	{
		return i_ser.getInfo(passengerid);
	}
	@GetMapping("/getall")
	public List<ItemModel> getDetails()
	{
		return i_ser.getInfo();
	}
	@GetMapping("/pagingAndSortingStudents/{offset}/{pageSize}/{field}")

	public List<ItemModel> pagingAndSortingEmployees(@PathVariable int offset,
			@PathVariable int pageSize,
			@PathVariable String field) 
	{
		return i_ser.pagingAndSortingEmployees(offset, pageSize, field);
	}
	//@GetMapping("/fetchStudentsByNamePrefix")
	//public List<ItemModel> fetchStudentsByNamePrefix(@RequestParam String prefix)
	//{
		 // return i_ser.fetchStudentsByNamePrefix(prefix);
	//}
	//@GetMapping("/fetchStudentsByDepartment/{dept}/{name}")
	//public List<ItemModel> fetchItemModelByQuantity(@PathVariable String dept,@PathVariable String name)
	//{
		//return i_ser.getItemModelByQuantity(dept, name);
	//}
	@GetMapping("/login")
	public String wel(@RequestParam  String username,@RequestParam String password )
	{
	if(username.equals("vasu")&&password.equals("12345"))

	{
	return "Login successfull";
	}
	else
	{
	return "Login faild";
	}
	}
	@PostMapping("/log")
	public String login(@RequestBody Map<String,String> loginDataMap)
	{
		String username=loginDataMap.get("username");
		String password=loginDataMap.get("password");
		String result=i_ser.logincheckData(username, password);
		return result;
		
	}
	@DeleteMapping("/deleteStudentByName/{username}")
	public String deleteStudentByName(@PathVariable String username)
	{
	int result=i_ser.delete(username)	;
	if(result >0)
		return "Student record deleted";
	else
		return "Problem occured while deleting";
	}
	@GetMapping("/get")
	public List<ItemModel>get()
	{
		return i_ser.get();
	}
	@PutMapping("/update/{name}/{id}")

	public String update(@PathVariable String name,@PathVariable int id)

	{

		int result=i_ser.update(name,id);

		if(result>0)

			return "Updated Successfully";

		else

			return "Problem occur while updating";

	}
}
