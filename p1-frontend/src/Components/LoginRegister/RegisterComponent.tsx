import { Button, Container, Form } from "react-bootstrap"
import 'bootstrap/dist/css/bootstrap.css'

export const RegisterComponent: React.FC = () => {
    //TODO: function to store values
    const storeValues = (input: any) => {

    }
    //Register Function that sends the username/password
    return (
        /* What's my and mx? This is margin for y and x axis
        we set my-5 so that we have a decent amount of space away from the top of the page mx-auto center the content horizontally */
        <Container className="my-5 mx-auto">
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

            <div >
                <Button className="btn-success m-1">Register</Button>
                <Button className="btn-dark">Back</Button>
            </div>
        </Container>
    )
}