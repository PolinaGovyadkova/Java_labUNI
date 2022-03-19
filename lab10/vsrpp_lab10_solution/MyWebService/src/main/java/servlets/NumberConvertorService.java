package servlets;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface NumberConvertorService {
    @WebMethod
    public String toLower(String str);

    @WebMethod
    public String replace(String str1, String str2, String str3);

    @WebMethod
    public String reverse(String str);
}
