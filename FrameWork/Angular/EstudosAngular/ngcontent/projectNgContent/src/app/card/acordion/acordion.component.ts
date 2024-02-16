import { Component, Input, OnInit } from '@angular/core';
import { Episode } from 'src/app/model/Episode';

@Component({
  selector: 'app-acordion',
  templateUrl: './acordion.component.html',
  styleUrls: ['./acordion.component.css']
})
export class AcordionComponent implements OnInit {
  @Input() episode:any;

  constructor() { }

  ngOnInit(): void {
  }

}
