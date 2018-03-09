/*
 * Marketcheck Cars API
 * <b>Access the New, Used and Certified cars inventories for all Car Dealers in US.</b> <br/>The data is sourced from online listings by over 44,000 Car dealers in US. At any time, there are about 6.2M searchable listings (about 1.9M unique VINs) for Used & Certified cars and about 6.6M (about 3.9M unique VINs) New Car listings from all over US. We use this API at the back for our website <a href='https://www.marketcheck.com' target='_blank'>www.marketcheck.com</a> and our Android and iOS mobile apps too.<br/><h5> Few useful links : </h5><ul><li>A quick view of the API and the use cases is depicated <a href='https://portals.marketcheck.com/mcapi/' target='_blank'>here</a></li><li>The Postman collection with various usages of the API is shared here https://www.getpostman.com/collections/2752684ff636cdd7bac2</li></ul>
 *
 * OpenAPI spec version: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package marketcheck.cars.api.client.api;

import marketcheck.cars.api.client.ApiException;
import marketcheck.cars.api..client.model.Error;
import marketcheck.cars.api..client.model.FacetItem;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FacetsApi
 */
@Ignore
public class FacetsApiTest {

    private final FacetsApi api = new FacetsApi();

    
    /**
     * Facets
     *
     * [Merged with the /search API - Please check the &#39;facets&#39; parameter to the Search API above] Get the facets for the given simple filter criteria (by given VIN&#39;s basic specification, Or by Year, Make, Model, Trim criteria) and facet fields
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFacetsTest() throws ApiException {
        String fields = null;
        String apiKey = null;
        String vin = null;
        String year = null;
        String make = null;
        String model = null;
        String trim = null;
        List<FacetItem> response = api.getFacets(fields, apiKey, vin, year, make, model, trim);

        // TODO: test validations
    }
    
}