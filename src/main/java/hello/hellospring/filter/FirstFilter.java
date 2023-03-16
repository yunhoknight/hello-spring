package hello.hellospring.filter;

import javax.servlet.*;
import java.io.IOException;

public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("FirtstFilter 생성됨!");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("==========First 필터 시작==========");
        chain.doFilter(request, response);
        System.out.println("==========First 필터 종료==========");
    }

    @Override
    public void destroy() {
        System.out.println("FirstFilter Destory!!");
        Filter.super.destroy();
    }
}
