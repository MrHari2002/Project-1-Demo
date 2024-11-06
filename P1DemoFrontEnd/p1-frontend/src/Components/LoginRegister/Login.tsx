import { Container } from "react-bootstrap"
import { useNavigate } from "react-router-dom"

export const Login:React.FC = () => {

    //TODO: a state object that holds username and password


    //we need a useNavigate hook to navigate between components programatically
        //(which means we don't have to manually switch the URL!)
    const navigate = useNavigate()

    //TODO: function that stores user input

    //TODO: function that does the login

    return(
        /*Bootstrap gives us this Container element that does some default padding and centering*/
        <Container> 
            <h3>Login inputs etc. pending</h3>

            <button>Login</button>
            <button onClick={()=>navigate("/register")}>Register</button>
        </Container>
    )

}