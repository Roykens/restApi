/**
 * 
 */
package com.royken.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.royken.restapi.data.entities.BaseClass;

/**
 * @author Kenfack Valmy-Roi <roykenvalmy@gmail.com>
 *
 */
@NoRepositoryBean
public interface IGenericDao<T extends BaseClass> extends JpaRepository<T, Long> {

}
