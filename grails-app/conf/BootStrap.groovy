import com.yourapp.Role
import com.yourapp.User
import com.yourapp.UserRole
class BootStrap {

    def init = { servletContext ->
	if (User.count() == 0) {
            def adminUser = new User(username: "trajano", password: "trajano").save(failOnError: true)
            UserRole.create adminUser, new Role(authority: "ROLE_ADMIN").save(failOnError: true)
            UserRole.create adminUser, new Role(authority: "ROLE_USER").save(failOnError: true)
        }
    }
    def destroy = {
    }
}
