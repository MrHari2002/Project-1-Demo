import { Button, Container, Table } from "react-bootstrap"

export const PetTable: React.FC<{ pets: any[] }> = ({ pets }) => {
    const updatePet = (id: number) => {
        alert("Pets with id " + id + "has been updated")
    }

    const deletePet = (id: number) => {
        alert("Pets with id " + id + "has been deleted")
    }

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
                            <td>
                                <Button className="btn-info" onClick={() => updatePet(pet.petId)}>Update</Button>
                                <Button className="btn-danger" onClick={() => updatePet(pet.petId)}>Delete</Button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </Table>
        </Container>
    )
}