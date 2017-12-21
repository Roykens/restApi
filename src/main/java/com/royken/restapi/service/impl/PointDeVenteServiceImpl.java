package com.royken.restapi.service.impl;

import com.royken.restapi.dao.contract.IPointDeVenteDao;
import com.royken.restapi.data.entities.PointDeVente;
import com.royken.restapi.service.CommonService;
import com.royken.restapi.service.contract.IPointDeventeService;
import com.royken.restapi.utils.Exceptions.PdvException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Kenfack Valmy-Roi <roykenvalmy@gmail.com>
 */
@Service
@Transactional
public class PointDeVenteServiceImpl extends CommonService implements IPointDeventeService {

    private PointDeVenteServiceImpl() {

    }

    private static Logger logger = Logger.getLogger(PointDeVenteServiceImpl.class);

    @Autowired
    IPointDeVenteDao pointDeVenteDao;

    /**
     *
     */
    private static final long serialVersionUID = 5312654627637510804L;

    @Override
    public PointDeVente createOrUpdateEntity(PointDeVente entity) throws PdvException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PointDeVente getEntityById(Long entityId) throws PdvException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteEntity(PointDeVente entity) throws PdvException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Long entityId) throws PdvException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Page<PointDeVente> getAllEntities(int page, int size) throws PdvException {
        try {
            return pointDeVenteDao.findAll(new PageRequest(1, 10));

        } catch (Exception e) {
            PdvException coreException = new PdvException(errorMessagesFilePath,
                    "THRAVVELCOREAGENCYSERVICEERROR-007");
            logger.error(coreException.getMessage(), e);
            throw coreException;

        }
    }

    @Override
    public Page<PointDeVente> findEntities(String keyWord, int page, int size) throws PdvException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
