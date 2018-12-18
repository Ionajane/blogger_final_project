import React, {Component} from 'react';
import Request from '../../helpers/Request.js';
import ArticleForm from '../../components/article/ArticleForm.js';

class ArticleFormContainer extends Component {
  constructor(props){
    super(props);
    this.state = {journalist: []}
    this.handleArticlePost = this.handleArticlePost.bind(this);
  }

  componentDidMount(){
    const request = new Request();
    request.get("/journalists").then((data) => {
      this.setState({journalists: data._embedded.journalists})
    })
  }

  handleArticlePost(article, journalistId){
    const request = new Request();
    request.post('/articles', article).then( () => {
      window.location = '/articles'
    })
  }

  render(){
    return (
      <ArticleForm
      journalists={this.state.journalists}
      handleArticlePost={this.handleArticlePost}
      />
    )
  }
}


export default ArticleFormContainer;
