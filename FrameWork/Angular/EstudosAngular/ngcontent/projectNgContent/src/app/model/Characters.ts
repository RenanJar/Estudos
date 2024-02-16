import { Episode } from "./Episode"
export interface Characters{

    id: number
    name:string
    status: string
    species: string
    type: string
    gender: string
    origin: object
    location: object
    image:string
    Episode:Episode[]
    url: string
    created: string
}