export class educacion{
    id?: number;
    nombreedu: String;
    descripcionedu: String;
    data: String;

    constructor(nombreedu: String,descripcionedu: String, data:String){
        this.nombreedu = nombreedu;
        this.descripcionedu = descripcionedu;
        this.data = data;
    }
}