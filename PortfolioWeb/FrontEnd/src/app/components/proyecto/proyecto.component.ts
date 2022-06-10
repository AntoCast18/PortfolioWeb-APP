import { Component, OnInit } from '@angular/core';
//import { proyecto } from 'src/app/model/proyecto.model';
//import { ProyectoService } from 'src/app/service/proyecto.service';

@Component({
  selector: 'app-proyecto',
  templateUrl: './proyecto.component.html',
  styleUrls: ['./proyecto.component.css']
})
export class ProyectoComponent implements OnInit {
  //proyecto: proyecto = new proyecto ("","","");
  
  constructor() { }

  ngOnInit(): void {
    //this.proyectoService.getproyecto().subscribe(data => {this.proyecto = data})
  }

}
