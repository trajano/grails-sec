import com.yourapp.User
class BootStrap {

    def init = { servletContext ->
	if (User.count() == 0) {
            new User(username: "trajano", password: "trajano").save(failOnError: true)
        }
    }
    def destroy = {
    }
}
