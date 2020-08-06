import {Component, OnInit} from '@angular/core';
import {NgbDropdownConfig} from '@ng-bootstrap/ng-bootstrap';
import { Translate, LANG_LIST } from 'src/app/services/translate/translate.service';

@Component({
  selector: 'app-nav-right',
  templateUrl: './nav-right.component.html',
  styleUrls: ['./nav-right.component.scss'],
  providers: [NgbDropdownConfig]
})
export class NavRightComponent implements OnInit {
  currentLanguage : string;
  langList = LANG_LIST
  constructor(
   private translate : Translate
  ) {
   this.currentLanguage = this.translate.getCurrentLanguage();
  } 

  ngOnInit() {
    this.translate.currentlanguage$.subscribe((lang : string) => {
      if(lang){
        this.currentLanguage = lang;
      }
    })
   }
  changeLanguage(lang : any){
    if(lang != this.currentLanguage){
      console.log("Log",lang);
      this.translate.changeLanguage(lang);
    }
    return;
  }
}
