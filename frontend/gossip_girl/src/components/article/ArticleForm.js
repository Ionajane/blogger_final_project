import React from 'react';

const ArticleForm = (props) => {

  function handleSubmit(event){
    event.preventDefault();

    const article = {
      "title": event.target.title.value,
      "date": event.target.date.value,
      "category": event.target.category.value,
      "body": event.target.body.value,
      "journalist": [...event.target.journalist.options].filter((option) => {
        return option.selected
      }).map((option) => {
        return option.value
      })
    }
    props.handleArticlePost(article)

  }

  // const journalistOptions = props.journalist.map((journalist, index) => {
  //   return <option key={index} value{journalist._links.self.href}>{journalist.location}</option>
  // })

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <input type="text" placeholder="Title" name="title"/>
        <input type="Date" placeholder="Date" name="date"/>
        <input type="text" placeholder="Category" name="category"/>
        <input type="text" placeholder="Body" name="body"/>
      
      </form>
    </div>
  )

}

export default ArticleForm;
