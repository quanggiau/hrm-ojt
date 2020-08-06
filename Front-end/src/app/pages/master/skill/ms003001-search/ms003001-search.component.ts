import { Component, OnInit, ChangeDetectionStrategy, OnDestroy, ChangeDetectorRef } from '@angular/core';
// import { Department } from '../departmentEntity/department';
import { FormControl, FormGroup, FormBuilder } from '@angular/forms';
import { Subscription } from 'rxjs';
import { pageOpiton } from 'src/app/common/page-options';
import { Skill, skillList } from '../skill-entity/skill';
import { MS003001SearchService } from './ms003001-search.service';

@Component({
  selector: 'app-skill-list',
  templateUrl: './ms003001-search.component.html',
})
export class MS003001SearchComponent implements OnInit, OnDestroy {
  // TODO : REMOVE PROPS
  checksearch = '';
  checkauto = false;
  save = '';
  remove  = 'outline-danger';
  public isCollapsed = false;

  skillLists: Skill[];
  // trang hien thi
  page = 1;
  // kich thuoc hien thi 1 trang
  pageSize = 30;
  // page hien thi dau tien
  pageNum = 0;
  pageNumDefault = 0;
  totalRecord = 30;
  // Có nên xoay trang khi maxSize> số trang.
  rotate: boolean;
  // Số lượng trang tối đa để hiển thị.
  maxSize = 3;
  pageOpiton = pageOpiton;
  FormSearch = new FormGroup({
      skillName : new FormControl(''),
      skillCode : new FormControl(''),
      companyID : new FormControl(),
      pageNum: new FormControl(),
      pageSize: new FormControl(),
  });
  setOfCheckedId = new Set<number>();
  // leak
  subcription: Subscription;
  //
  constructor(
    private changeDetector: ChangeDetectorRef,
    private skillService: MS003001SearchService,
    private formBuilder: FormBuilder,
    ) {}
    //
  ngOnInit(): void {
    alert(1);
    this.checksearch = 'block';
    this.FormSearch = this.formBuilder.group({
      skillCode: ['', ],
      skillName: ['', ],
      companyID: [1, ],
      pageNum: [0, ],
      pageSize:  [30, ],
    });
    // get date the first time
    this.subcription = this.skillService.getSkill(this.FormSearch.value).subscribe(rep => {
      console.log(rep.content.data);
      this.skillLists = rep.content.data;
      this.totalRecord = rep.content.totalElements;
    });
    alert(2);
  }

  ngOnDestroy(): void {
    if (this.subcription) {
      this.subcription.unsubscribe();
    }
  }

  searchSkill() {
    const SkillSearch = this.FormSearch.value;
    this.FormSearch.value.pageNum = 0;
    this.FormSearch.value.pageSize = 30;
    this.subcription = this.skillService.getSkill(this.FormSearch.value).subscribe(rep => {
      this.skillLists = rep.content.data;
      this.totalRecord = rep.content.totalElements;
    });
  }

  changePageSize(pageSize: number): void {
    this.FormSearch.value.pageSize = pageSize;
    this.subcription = this.skillService.getSkill(this.FormSearch.value).subscribe(rep => {
      this.skillLists = rep.content.data;
      this.changeDetector.detectChanges();
      this.totalRecord = rep.content.totalElements;
    });
  }
// chance page num
  pageChangeOutput(currentPage: number) {
    this.FormSearch.value.pageNum = currentPage;
    this.subcription = this.skillService.getSkill(this.FormSearch.value).subscribe(rep => {
      this.skillLists = rep.content.data;
      this.changeDetector.detectChanges();
      this.totalRecord = rep.totalElements;
  } );
  }
  onItemChecked(id: number, event) {
    this.updateCheckedSet(id, event.target.checked);
  }

  updateCheckedSet(id: number, checked: boolean): void {
    console.log('ID -> ', id, '-> checked', checked);
    if (checked) {
        this.setOfCheckedId.add(id);
      } else {
        this.setOfCheckedId.delete(id);
      }
  }

  deleteSkill() {
    console.log('ids', this.setOfCheckedId);
  }
  Search(event: Event) {
    if ((event.target as HTMLInputElement).click) {
      if (this.checksearch === 'hidden') {
        this.checksearch = 'block';
       // this.iconsearch = 'icon-minus';
       // this.titlesearch = 'Close';
      } else {
        this.checksearch = 'hidden';
      //  this.iconsearch = 'icon-plus';
       // this.titlesearch = 'Open';
      }
    }
  }
  SaveAction(id: number, event: Event) {
    this.checkauto = (event.target as HTMLInputElement).checked;
    if (this.checkauto === true) {
      this.save += (event.target as HTMLInputElement).value + ',';
    } else {
      this.save = this.save.replace((event.target as HTMLInputElement).value + ',', '');
    }
    if (this.save !== '') {
      this.remove = 'danger';
    } else {
      this.remove = 'outline-danger';
    }
  }
}
