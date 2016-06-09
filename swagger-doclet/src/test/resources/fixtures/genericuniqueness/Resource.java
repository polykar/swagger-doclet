package fixtures.genericuniqueness;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@SuppressWarnings("javadoc")
@Path("/api")
public class Resource {

	@GET
	@Path("bar")
	public Dto<Bar> bar() {
		return null;
	}

	@GET
	@Path("foo")
	public Dto<Foo> foo() {
		return null;
	}
}
