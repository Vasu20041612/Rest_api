package org.crud.app.repository;

import org.crud.app.model.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<AdminModel, String> {

}
