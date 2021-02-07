package codereview;
​
import org.json.JSONObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
​
@WebServlet(name = "GamerRewardsServlet", urlPatterns = "/gamerRewardsServlet")
public class EmployeeVacationServlet extends HttpServlet {
​
    EmployeeManagement gamerManagement = new GamerManagement();
​
    /**
     * Reads the gamer ID and number of credits they want to redeem and calculates 
     * how many hours of game play they get with that given their gamerlevel. 
     * It also writes the response data
     */
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //TODO
    }
​
    /**
     * Writes a json string in the response data
     *
     * @param response an HttpServletResponse object that contains the response the servlet sends
     * to the client
     * @param json a string with the information to be written
     * @throws IOException if an input or output exception occurs
     */
    private void respond(HttpServletResponse response, String json) throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(json);
        out.flush();
    }
}
​