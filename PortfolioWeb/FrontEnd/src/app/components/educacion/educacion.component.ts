//import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
//import { Educacion } from 'src/app/model/educacion.model';
//import { EducacionService } from 'src/app/service/educacion.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {
  
  //educacion:Educacion[] = [];
  
  constructor() { } //private educacionService: EducacionService

  ngOnInit(): void {
   // this.getEducacion();
  }

  public getEducacion():void{
    //this.educacionService.getEducacion().subscribe(       data => {        this.educacion = data;       },       error => {
      // console.log(error);       }     )   } }
  //this.educacionService.getEducacion().subscribe({
    //next:(Response: Educacion[]) => {       this.educacion=Response;       }, //error:(error:HttpErrorResponse)=>{
       // alert(error.message);         }    })   }
}
}
