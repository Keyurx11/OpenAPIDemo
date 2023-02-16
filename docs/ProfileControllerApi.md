# ProfileControllerApi

All URIs are relative to *http://localhost:8085*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**descriptor111**](ProfileControllerApi.md#descriptor111) | **GET** /profile/course |  |
| [**descriptor112**](ProfileControllerApi.md#descriptor112) | **GET** /profile/coursename |  |
| [**descriptor113**](ProfileControllerApi.md#descriptor113) | **GET** /profile/degreetype |  |
| [**descriptor114**](ProfileControllerApi.md#descriptor114) | **GET** /profile/student |  |
| [**listAllFormsOfMetadata1**](ProfileControllerApi.md#listAllFormsOfMetadata1) | **GET** /profile |  |


<a name="descriptor111"></a>
# **descriptor111**
> String descriptor111()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProfileControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    ProfileControllerApi apiInstance = new ProfileControllerApi(defaultClient);
    try {
      String result = apiInstance.descriptor111();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileControllerApi#descriptor111");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/alps+json, application/schema+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="descriptor112"></a>
# **descriptor112**
> String descriptor112()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProfileControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    ProfileControllerApi apiInstance = new ProfileControllerApi(defaultClient);
    try {
      String result = apiInstance.descriptor112();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileControllerApi#descriptor112");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/alps+json, application/schema+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="descriptor113"></a>
# **descriptor113**
> String descriptor113()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProfileControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    ProfileControllerApi apiInstance = new ProfileControllerApi(defaultClient);
    try {
      String result = apiInstance.descriptor113();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileControllerApi#descriptor113");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/alps+json, application/schema+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="descriptor114"></a>
# **descriptor114**
> String descriptor114()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProfileControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    ProfileControllerApi apiInstance = new ProfileControllerApi(defaultClient);
    try {
      String result = apiInstance.descriptor114();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileControllerApi#descriptor114");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/alps+json, application/schema+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listAllFormsOfMetadata1"></a>
# **listAllFormsOfMetadata1**
> RepresentationModelObject listAllFormsOfMetadata1()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProfileControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8085");

    ProfileControllerApi apiInstance = new ProfileControllerApi(defaultClient);
    try {
      RepresentationModelObject result = apiInstance.listAllFormsOfMetadata1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileControllerApi#listAllFormsOfMetadata1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RepresentationModelObject**](RepresentationModelObject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

