package servlets;

import javax.jws.WebService;

@WebService(endpointInterface = "servlets.NumberConvertorService")
public class StrConverterImpl implements servlets.NumberConvertorService {
    @Override
    public String toLower(String str) {
        return str.toLowerCase();
    }

    @Override
    public String replace(String str1, String str2, String str3) {
        return str1.replace(str2, str3);
    }

    @Override
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
