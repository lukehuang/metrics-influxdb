package metrics_influxdb.api.protocols;

public class UDPInfluxdbProtocol implements InfluxdbProtocol {
	public final String host;
	public final int port;

	public UDPInfluxdbProtocol(String host, int port) {
		this.host = host;
		this.port = port;
	}
}
