package it.larus.study.myapp.user.representation;

/**
 * Rappresentation of link resource
 * 
 * @author omar
 *
 */
public class HypermediaLink {

	private String name;
	private String url;
	private String method;

	public HypermediaLink() {
	}

	public HypermediaLink(String name, String url, String method) {
		super();
		this.name = name;
		this.url = url;
		this.method = method;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

}
