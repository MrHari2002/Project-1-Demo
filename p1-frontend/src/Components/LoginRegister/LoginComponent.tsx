import { Container } from "react-bootstrap"
import { useNavigate } from "react-router-dom"

export const LoginComponent: React.FC<any> = () => {

    //We need a useNavigate hook to navigate between components programmatically
    const navigate = useNavigate()

    //TODO: function that stores user input
    //TODO: function that does the login
    return (
        <Container>
            <h3>Login Inputs etc. pending</h3>
            <button>Login</button>
            <button onClick={() => navigate("/register")}>Register</button>
        </Container>
    )
}