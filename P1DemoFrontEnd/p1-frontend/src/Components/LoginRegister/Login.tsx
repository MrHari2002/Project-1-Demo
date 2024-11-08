import axios from "axios"
import { useState } from "react"
import { Button, Container, Form } from "react-bootstrap"
import { useNavigate } from "react-router-dom"
import { store } from "../../globalData/store"
import { error } from "console"

export const Login: React.FC = () => {

    //TODO: a state object that holds username and password

    const [loginCreds, setLoginCreds] = useState({
        username: "",
        password: ""
    })
    //we need a useNavigate hook to navigate between components programatically
    //(which means we don't have to manually switch the URL!)
    const navigate = useNavigate()

    //TODO: function that stores user input
    const storeValues = (input: any) => {

        const name = input.target.name //the name of the input box that changed
        const value = input.target.value //the value in the input box

        setLoginCreds((loginCreds) => ({ ...loginCreds, [name]: value }))

        //check comments in storeValues() of Register.tsx for how this all works
    }
    //TODO: function that does the login
    const login = async () => {
        //TODO: We should make sure the username/ password are inputted first

        //user the username/password in the loginCreds state object
        const response = await axios.post("http://localhost:7777/auth", loginCreds)
            .then(
                //Alert the user they logged in
                //If the request is successful
                //print the data
                //save it locally
                //alert the user they logged in
                //navigate to /pets
                (response) => {

                    console.log(response)

                    //saving the data locally
                    store.loggedInUser = response.data

                    alert("Welcome, " + store.loggedInUser.username)

                    navigate("/pet")




                }
            )
            .catch((error) => {
                alert("Login Failed! Please try again")
            })
        //Then And Catch()
    }

    return (
        /*Bootstrap gives us this Container element that does some default padding and centering*/
        <Container>
            <h3>Login inputs etc. pending</h3>
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
            <Button className="btn-success m-1" onClick={login}>Login</Button>
            <Button onClick={() => navigate("/register")}>Register</Button>
        </Container>
    )

}