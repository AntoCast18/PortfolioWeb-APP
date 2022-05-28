export class proyecto{
    id?: number;
    nombrepro: String;
    descripcionpro: String;
    img: String;

    constructor(nombrepro: String,descripcionpro: String, img:String){
        this.nombrepro = nombrepro;
        this.descripcionpro = descripcionpro;
        this.img = img;
    }
}