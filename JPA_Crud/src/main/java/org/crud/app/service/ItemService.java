package org.crud.app.service;

import java.util.List;
import java.util.Optional;

import org.crud.app.model.ItemModel;
import org.crud.app.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ItemService {
	@Autowired
    ItemRepo i_repo;
	public ItemModel saveInfo(ItemModel i)
	{
		return i_repo.save(i);
	}
	
	public ItemModel updateInfo(ItemModel iu)
	{
		return i_repo.save(iu);
	}
	public void deleteInfo(int passengerid)
	{
		i_repo.deleteById(passengerid);
	}
	public List<ItemModel> sortItemModel(String field) {
		return i_repo.findAll(Sort.by(field));
	}
	public Optional<ItemModel> getInfo(int passengerid)
	{
		return i_repo.findById(passengerid);
	}
	public List <ItemModel> getInfo()
	{
		return i_repo.findAll();
	}
	public List<ItemModel> pagingAndSortingEmployees(int offset,
			int pageSize,String field) {
		Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
			Page<ItemModel> stud=i_repo.findAll(paging);
			return stud.getContent();
	}
	//public List<ItemModel> fetchStudentsByNamePrefix(String prefix)
	//{
		//  return i_repo.findByNameStartingWith(prefix);
	 //}
	//public List<ItemModel> getItemModelByQuantity(String dept,String name)
	  //{
		//  return i_repo.getItemModelByQuantity(dept, name);
	  //}
	public String logincheckData(String username,String password)
	{
		ItemModel user=i_repo.findByusername(username);
		if(user == null)
		{
			return "No User Found/nPlease Try Again!!!!";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Succesful";
			}
			else
			{
				return "Login Faild";
			}
		}
	}
	@Transactional
	public List<ItemModel> get()
	{
		return i_repo.GetAll();
	}
	@Transactional
	public int delete(String username)
	{
		return i_repo.DeleteItemByUsername(username);
	}
	@Transactional

	 public int update(String name,int id)

	 {

		 return i_repo.UpdateItemById(name,id);

	 }

}
