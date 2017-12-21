package com.royken.restapi.dao.contract;

import com.royken.restapi.dao.IGenericDao;
import com.royken.restapi.data.entities.PointDeVente;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kenfack Valmy-Roi <roykenvalmy@gmail.com>
 */
@Repository
public interface IPointDeVenteDao extends IGenericDao<PointDeVente> {
    
 
    
}
