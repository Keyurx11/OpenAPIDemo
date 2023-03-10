/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.EntityModelStudent;
import org.openapitools.client.model.PagedModelEntityModelStudent;
import org.openapitools.client.model.StudentRequestBody;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StudentEntityControllerApi
 */
@Disabled
public class StudentEntityControllerApiTest {

    private final StudentEntityControllerApi api = new StudentEntityControllerApi();

    /**
     * delete-student
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteItemResourceStudentDeleteTest() throws ApiException {
        String id = null;
        api.deleteItemResourceStudentDelete(id);
        // TODO: test validations
    }

    /**
     * get-student
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCollectionResourceStudentGet1Test() throws ApiException {
        Integer page = null;
        Integer size = null;
        List<String> sort = null;
        PagedModelEntityModelStudent response = api.getCollectionResourceStudentGet1(page, size, sort);
        // TODO: test validations
    }

    /**
     * get-student
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getItemResourceStudentGetTest() throws ApiException {
        String id = null;
        EntityModelStudent response = api.getItemResourceStudentGet(id);
        // TODO: test validations
    }

    /**
     * patch-student
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchItemResourceStudentPatchTest() throws ApiException {
        String id = null;
        StudentRequestBody studentRequestBody = null;
        EntityModelStudent response = api.patchItemResourceStudentPatch(id, studentRequestBody);
        // TODO: test validations
    }

    /**
     * create-student
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postCollectionResourceStudentPostTest() throws ApiException {
        StudentRequestBody studentRequestBody = null;
        EntityModelStudent response = api.postCollectionResourceStudentPost(studentRequestBody);
        // TODO: test validations
    }

    /**
     * update-student
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putItemResourceStudentPutTest() throws ApiException {
        String id = null;
        StudentRequestBody studentRequestBody = null;
        EntityModelStudent response = api.putItemResourceStudentPut(id, studentRequestBody);
        // TODO: test validations
    }

}
