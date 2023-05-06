package org.crud.app.repository;

import java.util.List;

//import java.util.List;

import org.crud.app.model.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;

public interface ItemRepo extends JpaRepository<ItemModel, Integer> {

	//@Query("select s from ItemModel s where s.quantity=?1 and s.name=?2" )
	//public List<ItemModel> getItemModelByQuantity(String dept,String name);
	//List<ItemModel> findByNameStartingWith(String prefix);
	//List<ItemModel> findByNameEndingWith(String suffix);
	ItemModel findByusername(String username);
//	List<ItemModel> findByDepartment(String );
	@Modifying
	@Query(value="select * from passenger_details ",nativeQuery=true)
	public List<ItemModel> GetAll();
    @Modifying
	@Query("delete from ItemModel i where i.username=?1")
	public int DeleteItemByUsername(String username);
    @Modifying

	@Query("update ItemModel e set e.username=?1 where e.userid=?2")

	public int UpdateItemById(String username,int userid);
    
}
