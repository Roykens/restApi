package com.royken.restapi.controller;

import com.royken.restapi.data.entities.PointDeVente;
import com.royken.restapi.service.contract.IPointDeventeService;
import com.royken.restapi.utils.Exceptions.PdvException;
import com.royken.restapi.utils.SharedResourcesProvider;
import com.royken.restapi.utils.PdvConstants;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Kenfack Valmy-Roi <roykenvalmy@gmail.com>
 */
@RestController
public class PointDeVenteCtrl {
    
     private static final Logger logger = Logger.getLogger(PointDeVenteCtrl.class);
    private Map<String, Object> resultMap;
    private final Properties messageCtx = SharedResourcesProvider.getInstance().getFrontMessageCtx();
    private String errorMessage;

    @Autowired
    IPointDeventeService pointDeventeService;
    
    /**
     * Cette methode reçoit la latitude et la longitude en paramètre et fait en travail
     */
      @RequestMapping(value = "/pdvs/nearest/{latitude}/{longitude:.+}", method = RequestMethod.GET)
    public Map<String, Object> findNearest(HttpServletRequest request, @PathVariable("latitude") double latitude, @PathVariable("longitude") double longitude) {
        resultMap = new HashMap<>();
      
        // TODO
        return resultMap;

    }
    
    @RequestMapping(value = "/pdv", method = RequestMethod.GET)
    public Map<String, Object> listPointsDeVente(@RequestParam(defaultValue = "0", value = "page") int page,
            @RequestParam(defaultValue = "1", value = "size") int size) {
        resultMap = new HashMap<String, Object>();
        try {
            Page<PointDeVente> payload = pointDeventeService.getAllEntities(page, size);
            resultMap.put(PdvConstants.JSON_SUCCESS_KEY, Boolean.TRUE);
            resultMap.put(PdvConstants.JSON_PAYLOAD_KEY, payload);

        } catch (PdvException tce) {
            resultMap.put(PdvConstants.JSON_SUCCESS_KEY, Boolean.FALSE);
            resultMap.put(PdvConstants.JSON_MESSAGE_KEY, tce.getMessage().substring(tce.getMessage().lastIndexOf('-') + 1));
            logger.error(tce);

        } catch (Exception e) {
            errorMessage = MessageFormat.format(messageCtx.getProperty("THRAVVELCORESTATIONCTRL-002"), (Object) null);
            resultMap.put(PdvConstants.JSON_SUCCESS_KEY, Boolean.FALSE);
            resultMap.put(PdvConstants.JSON_MESSAGE_KEY, errorMessage.substring(errorMessage.lastIndexOf('-') + 1));
            logger.error(errorMessage, e);

        }
        return resultMap;
    }
    
}
