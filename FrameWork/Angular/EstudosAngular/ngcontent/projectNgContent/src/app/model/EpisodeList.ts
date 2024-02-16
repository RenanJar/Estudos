import { info } from "./info";
import { Episode } from "./Episode";

export interface EpisodeList{
    info: info
    results: Episode[]
}