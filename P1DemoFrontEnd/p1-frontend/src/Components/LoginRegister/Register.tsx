import { Button, Container, Form } from "react-bootstrap"


export const Register:React.FC = () => {

    //Define a state object to store the username and password

    //TODO: function to store values
    const storeValues = (input:any) => {
        
    }

    //Register function that sends the username/password to the backend
    

    return(
        /* what's my and mx? this is margin for y and x axis
        we set my-5 so that we have a decent amount of space away from the top of the page
        mx-auto centers the content horizontally */
        <Container className="my-5 mx-auto">
            <div>
                <h1>New here? Create an Account for free!</h1>

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

                <div>
                    <Button className="btn-success m-1">Register</Button>
                    <Button className="btn-dark">Back</Button>
                </div>
            </div>
        </Container>
    )

}