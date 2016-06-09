<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@page import="com.springmvc.*, java.util.*"%>

<div>
	<h2>List of Films</h2>

	<table title="List Of Films" border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>DESCRIPTION</th>
			<th>RELEASE YEAR</th>
			<th>PRICE</th>
		</tr>

		<%
			List<Film> filmList = (List) request.getAttribute("films");
			for (Film film : filmList) {
				out.println("<tr>");
				out.println("<td>" + film.getFilm_id() + "</td>");
				out.println("<td>" + film.getFilm_title() + "</td>");
				out.println("<td>" + film.getDescription() + "</td>");
				out.println("<td>" + film.getRelease_date() + "</td>");
				out.println("<td>" + film.getRental_rate() + "</td>");
				out.println("</tr>");
			}
		%>

	</table>

	
</div>