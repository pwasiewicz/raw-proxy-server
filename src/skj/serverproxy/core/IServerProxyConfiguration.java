package skj.serverproxy.core;

/**
 * Created by pwasiewicz on 16.03.14.
 */
public interface IServerProxyConfiguration {
    IServerProxyConfiguration onPort(int port);
    IServerProxyConfiguration onSSLPort(int port);
    IServerProxyConfiguration registerRequestFilter(AbstractRequestFilter... filters);
    IServerProxyConfiguration registerResponseFilter(AbstractResponseFilter... filters);
    IServerProxyCore start();
}
