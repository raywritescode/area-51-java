package com.raywritescode.iplocationfinder;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		if ( args.length != 1 ) {
			System.out.println( "You need to pass one IP address" );
		}
		else {
			String ipAddress = args[ 0 ];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
			GeoIP geoIp = geoIPServiceSoap.getGeoIP(ipAddress);
			System.out.println( geoIp.getIP() );
			System.out.println( geoIp.getReturnCodeDetails() );
			System.out.println( geoIp.getCountryName() );
			System.out.println( geoIp.getCountryCode() );
		}
	}
}