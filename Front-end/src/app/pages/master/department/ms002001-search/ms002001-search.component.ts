import { Component, OnInit, ChangeDetectionStrategy, OnDestroy, ChangeDetectorRef } from '@angular/core';
// import { Department } from '../departmentEntity/department';
import { FormControl } from '@angular/forms';
import { Subscription } from 'rxjs';
import { pageOpiton } from 'src/app/common/page-options';
import { Department, departmentList } from '../department-entity/department';
import { MS002001SearchService } from './ms002001-search.service';

@Component({
  selector: 'app-department-list',
  templateUrl: './ms002001-search.component.html',
  // changeDetection: ChangeDetectionStrategy.OnPush

})
export class MS002001SearchComponent implements OnInit, OnDestroy {
  // TODO : REMOVE PROPS
  checksearch = '';
  checkauto = false;
  save = '';
  iconsearch = 'icon-minus';
  titlesearch = 'Close';
  remove  = 'outline-danger';
  public isCollapsed = false;

  departmentLists: Department[];
  page = 1;
  pageSize = 30;
  pageNum = 0;
  pageNumDefault = 0;
  totalRecord = 30;
  // Có nên xoay trang khi maxSize> số trang.
  rotate: boolean;
  // Số lượng trang tối đa để hiển thị.
  maxSize = 3;
  pageOpiton = pageOpiton;
  departmentName = new FormControl('');
  setOfCheckedId = new Set<number>();
  // leak
  subcription: Subscription;
  constructor(
    private changeDetector: ChangeDetectorRef,
    private departmentService: MS002001SearchService ) {
  }
  ngOnInit(): void {
    this.checksearch = 'block';
    // default get all with params pageNum = 1 , pageSize = 30, search = ""
    this.departmentLists  =  departmentList;
     console.log("data",departmentList);
         //this.initData(this.pageNumDefault, this.pageSize, this.departmentName.value);
  }
  ngOnDestroy(): void {
    if (this.subcription) {
      this.subcription.unsubscribe();

    }
  }
  private initData(page: number, pageSize: number , keywork: string): void {
   this.subcription = this.departmentService.getDepartment(page, pageSize, keywork).subscribe(rep => {
      if (rep) {
        // tells Angular that you are now ready for it to run change detection.
        // this.changeDetector.detectChanges();
        //departmentList = rep.content.data;
        // this.maxSize = rep.totalPages;
        this.totalRecord = rep.totalElements;
      }
    });
  }
  searchDepartment() {
    const departmentNameSearch = this.departmentName.value;
    if (departmentNameSearch) {
      this.initData(this.pageNumDefault, this.pageSize, this.departmentName.value);
    }
  }

  changePageSize(pageSize: number): void {
    console.log('ChangePageSize', this.pageSize);
    this.pageSize = pageSize;
    this.initData(this.pageNumDefault, this.pageSize, this.departmentName.value);
  }

  pageChangeOutput(currentPage: number) {
    console.log('CurrentPage', currentPage);
    this.initData(currentPage, this.pageSize, this.departmentName.value);
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

  deleteDepartment() {
    console.log('ids', this.setOfCheckedId);
  }
  Search(event: Event) {
    if ((event.target as HTMLInputElement).click) {
      if (this.checksearch === 'hidden') {
        this.checksearch = 'block';
        this.iconsearch = 'icon-minus';
        this.titlesearch = 'Close';
      } else {
        this.checksearch = 'hidden';
        this.iconsearch = 'icon-plus';
        this.titlesearch = 'Open';
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
