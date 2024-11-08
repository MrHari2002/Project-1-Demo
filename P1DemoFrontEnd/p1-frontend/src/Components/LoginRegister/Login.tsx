import { useState } from "react"
import { Button, Container, Form } from "react-bootstrap"
import { useNavigate } from "react-router-dom"

export const Login:React.FC = () => {

    //A state object that holds username and password
    const[loginCreds, setLoginCreds] = useState({
        username:"",
        password:""
    })

    //we need a useNavigate hook to navigate between components programatically
        //(which means we don't have to manually switch the URL!)
    const navigate = useNavigate()

    //Function that stores user input
    const storeValues = (input:any) => {

        const name = input.target.name //the name of the input box that changed
        const value = input.target.value //the value in the input box 

        setLoginCreds((loginCreds) => ({...loginCreds, [name]:value}))

        //check comments in storeValues() of Register.tsx for how this all works
    }

    //Function that sends login POST request to the server
    //This navigates to /pets if role is "User" and /users if role is "Admin"



    return(
        /*Bootstrap gives us this Container element that does some default padding and centering*/
        <Container> 

            <h1>Welcome to the Pet Shop</h1>
                <h3>Please Log In:</h3>
                
                <div>
                    <Form.Control
                        type="text"
                        placeholder="username"
                        name="username"
                        onChange={storeValues}
                    />
                </div>

                <div>
                    <Form.Control
                        type="password"
                        placeholder="password"
                        name="password"
                        onChange={storeValues}
                    />
                </div>
                

            <Button className="btn-success m-1">Login</Button>
            <Button className="btn-dark" onClick={()=>navigate("/register")}>Register</Button>
        </Container>
    )

}