package org.openapitools.client;

import org.openapitools.client.api.CoursePropertyReferenceControllerApi;
import org.openapitools.client.api.StudentEntityControllerApi;
import org.openapitools.client.api.StudentPropertyReferenceControllerApi;
import org.openapitools.client.model.*;

public class MainClass {
    public static void main(String[] args) throws ApiException {
        String apiUrl = "http://localhost:8085";
        ApiClient client = new ApiClient();
        client.setBasePath(apiUrl);

        String studentID = "2";

        StudentEntityControllerApi studentEndPoint = new StudentEntityControllerApi(client);
        EntityModelStudent ems = studentEndPoint.getItemResourceStudentGet(studentID);

        StudentPropertyReferenceControllerApi studentReferenceEndPoint = new StudentPropertyReferenceControllerApi(client);
        EntityModelCourse emc = studentReferenceEndPoint.followPropertyReferenceStudentGet1(studentID);

        Link l = emc.getLinks().get("self");
        String courseHref = l.getHref();
        String courseIndex = courseHref.substring(courseHref.lastIndexOf("/") + 1);

        System.out.println(courseIndex);

        CoursePropertyReferenceControllerApi courseReferenceEndPoint = new CoursePropertyReferenceControllerApi(client);
        EntityModelCoursename emnc = courseReferenceEndPoint.followPropertyReferenceCourseGet1(courseIndex);

        EntityModelDegreetype emdt = courseReferenceEndPoint.followPropertyReferenceCourseGet2(courseIndex, "1");

        System.out.println("id: " + ems.getId());
        System.out.println("Name: " + ems.getName());
        System.out.println("Address: " + ems.getAddress());
        System.out.println("DOB: " + ems.getDob());
        System.out.println("Course Name: " + emdt.getShortcode() + " " + emnc.getcoursename());
    }
}
