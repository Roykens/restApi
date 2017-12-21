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
    
     /**
     *
     * @param latitude
     * @param longitude
     * @return nearest stations
     */
    @Query(value = "SELECT *, ( 6371 * acos( cos( radians(:lat) ) * cos( radians( LATITUDE ) ) * cos( radians( LONGITUDE ) - radians(:long) ) + sin( radians(:lat) ) * sin( radians( LATITUDE ) ) ) ) AS distance FROM pointdevente HAVING distance < 1.1 ORDER BY distance ;", nativeQuery = true)
    List<PointDeVente> findNearest(@Param("lat") double latitude, @Param("long") double longitude);

    
}
