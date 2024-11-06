import { Container, Form } from "react-bootstrap"

export const Register:React.FC = () => {


    //TODO: function to store values
    const storeValues = (input:any) => {
        
    }

    return(

        <Container>
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
                {/*TODO: buttons*/}
                </div>
            </div>
        </Container>
    )

}