import { Container, Table } from "react-bootstrap"

export const PetTable: React.FC<{ pets: any[] }> = ({ pets }) => {
    return (
        <Container>
            <Table>
                <thead>
                    <tr>
                        <th>Pet Id</th>
                        <th>Name</th>
                        <th>Species</th>
                    </tr>
                </thead>
                <tbody>
                    {pets.map((pet: any) => (
                        <tr key={pet.petId}>
                            <td>{pet.petId}</td>
                            <td>{pet.name}</td>
                            <td>{pet.species}</td>
                        </tr>
                    ))}
                </tbody>
            </Table>
        </Container>
    )
}